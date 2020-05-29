package week18;


public class NumPlay {
    int[] numbers;

    public NumPlay()
    {
        this.numbers= new int[5];
    }

    public void add(int i){
        try {
            this.numbers[i]=12;
        }
        catch (Exception x) {
            System.out.println("error");
        }
        finally {
            System.out.println("Block of of method");
        }

        }
        int search(int i){
        try {
            return numbers[i];
        }
        catch (Exception e){
            System.out.println("Exception ERROR");
            return 0;
        }
        finally {
            System.out.println("Method deleted");
        }

        }
        public void delete(int i){
           try {
               numbers[i]=0;
            }
           catch (Exception e){
               System.out.println("Exception ERROR");
           }
           finally {
               System.out.println("Method deleted finally");
           }
        }

    }

