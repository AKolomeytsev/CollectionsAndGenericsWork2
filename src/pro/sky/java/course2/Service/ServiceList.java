package pro.sky.java.course2.Service;

import pro.sky.java.course2.Data.DoubleWords;

import java.util.*;

public class ServiceList<T> {
    private List<T> items;

    public ServiceList(List<T> items) {
        this.items = items;
    }

    public LinkedList<T> getOddItems(){
        items.removeIf(e -> (int)e % 2 == 0);
        return (LinkedList<T>) items;
    }

    public Set<T> getEvenItemsDistinct(){
        Set<T> items2 = new TreeSet<>(items);
        items2.removeIf(e -> (int)e % 2 == 1);
        return items2;
    }

    public Set<T> getWordsDistinct(){
        Set<T> items2 = new HashSet<T>(items);
        return items2;
    }

    public ArrayList<DoubleWords> getDoubleWords(){
        Set<T> items2 = new HashSet<T>(items);
        ArrayList<DoubleWords> dw = new ArrayList<DoubleWords>();
        for (int i = 0; i<items.size();i++){
            items2.add(items.get(i));
        }
        int i = -1;

        while(items2.size()>0){
            i++;
            int dc = 0;
            String word = items2.iterator().next().toString();
            DoubleWords wordItem = new DoubleWords(word,1);
            for (int j = 0; j<items.size(); j++) {
                if(items.get(j).equals(word)){
                    dc++;
                    wordItem.setCnt(dc);
                }
            }
            if (dc>1) {
                dw.add(wordItem);
            }
            items2.remove(word);
        };
        return dw;
    }

    public int getCoutDoubleWords(){
        Set<T> items2 = new HashSet<T>(items);

        return items.size() - items2.size();
    }


}
