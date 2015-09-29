public class SortedArrayList {
    int[] data = new int[10];
    private int length = 0; 
     
    public SortedArrayList(){
         
    }
     
    public void add(int datum){
        if(length == data.length){
            this.expandArray();
        }
        data[length] = datum;
        length++;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int tmp = 0;
                if (data[i] > data[j]) {
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
     
    public void remove(int index){  
    	if(index > length - 1 || index < 0){
    		throw new ArrayIndexOutOfBoundsException();
    	}
        for(int i = index; i< length;i++){
            data[i] = data[i+1];
        }
        length--;
    }
     
    public int get(int index){
        if(length==0 || length - 1 < index){
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }
     
    public int size(){
        return length;
    }
     
    public boolean contains(int needle){
        for(int i = 0; i < length; i++){
            if(data[i] == needle){
                return true;
            }
        }
        return false;
    }
     
    public void clear(){
        data = new int[10];
        length = 0;
    }
     
    @Override
    public String toString(){
        String st = "";
        for(int i = 0; i < this.length;i++){
            st = st+data[i];
            st = st+"\n";
        }
        return st;
         
    }
     
    private void expandArray(){
        int temp[] = new int[data.length*2];
        for(int i = 0; i < this.size();i++){
            temp[i] = data[i];
        }
        data = temp;
    }
     
    public int[] toArray(){
        int temp[] = new int[length];
        for(int i = 0; i <length;i++){
            temp[i]=data[i];
        }
        return temp;
    }
 
}