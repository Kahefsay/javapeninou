package ordonne;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class OrderedSpecificList <T extends Comparable>{

    private Object arraySpecifiList [];
    private int size = 0;

    public OrderedSpecificList() {
        this.arraySpecifiList = new Object [10];
        for (int i=0; i<10; i++) {
            arraySpecifiList[i] = new Object();
        }
    }

    public int getSize() {
        return this.size;
    }

    public void addValue(T value) {
        this.arraySpecifiList[size] = value;

        for (int i = size + 1; i >= 0; i--) {
            for (int j = 1; j < i; j++) {
                if (this.arraySpecifiList[j-1].toString().compareTo(this.arraySpecifiList[j].toString()) > 0) {
                    Object tmp = this.arraySpecifiList[j-1];
                    this.arraySpecifiList[j-1] = this.arraySpecifiList[j];
                    this.arraySpecifiList[j] = tmp;
                }
            }
        }

        this.size++;
    }

    public <T> T getValue(int index) {
        return (T) this.arraySpecifiList[index];
    }

    public ArrayList<T> toArrayList() {
        ArrayList<T> arrayListSpecificList = new ArrayList<T>();
        for(int i = 0; i < this.getSize(); i++){
            { arrayListSpecificList.add((T) this.arraySpecifiList[i]); }
        }
        return arrayListSpecificList;
    }

}