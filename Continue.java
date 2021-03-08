
    public class Continue {
        public static void main(String[] args) {
            System.out.println("while loop");
            int i = 0;
            while (i < 10){
                if (i == 5){
                    i++;
                    continue;
                }
                System.out.println(i);
                i++;
            }
              // for loop
              System.out.println("for loop");
        int j;
        for (j = 0; j <= 10; j++){
            if (j == 7){
                continue;
            }
            System.out.println(j);
        }
        }
      
    }
    
