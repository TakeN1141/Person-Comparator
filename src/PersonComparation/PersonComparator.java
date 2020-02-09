package PersonComparation;

import fmi.informatics.extending.Person;
import javax.swing.*;
import java.util.Comparator;

    public abstract class PersonComparator implements Comparator<Person>{
        protected int sortOrder = 1;
        public void  setSortOrder(SortOrder order){
            if (order.equals(SortOrder.DESCENDING)){
                this.sortOrder=-1;
            }else{
                this.sortOrder=1;
            }

        }
    }


