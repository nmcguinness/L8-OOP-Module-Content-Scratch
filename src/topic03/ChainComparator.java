package topic03;

import java.util.ArrayList;
import java.util.Comparator;

public class ChainComparator implements Comparator<Product>{

    private ArrayList<Comparator<Product>> compList;

    public ChainComparator(){
        compList = new ArrayList<>();
    }

    public void add(Comparator<Product> comparator){
        if(compList != null && compList.contains(comparator) == false){
            compList.add(comparator);
        }
    }

    public void remove(Comparator<Product> comparator){
        if(compList != null && compList.contains(comparator) == true){
            compList.remove(comparator);
        }
    }


    @Override
    public int compare(Product o1, Product o2) {
        for(Comparator<Product> comp : compList)
        {
            int resultCompare = comp.compare(o1, o2);
            if(resultCompare != 0)
                return resultCompare;
        }

        return 0;
    }
}
