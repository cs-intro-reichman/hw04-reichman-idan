public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]);
        boolean[] arrsub = new boolean[n+1];
        int counter = 0;
        for (int i = 2; i < n+1; i++) {
            arrsub[i]= true;
            }  
        
        for(int j = 2; j< Math.sqrt(n*1.0); j++){

            if (arrsub[j]== true){
                counter = j+1;
                while (counter<=n){
                    if ( (counter*1.0)%(j*1.0)==0){
                        arrsub[counter]=false;
                    }

                    counter++;
                }
        }}
        System.out.println("Prime numbers up to "+ n +":");
        counter = 0;
        for (int i = 0; i < n+1; i++) {
            if (arrsub[i]== true){
                System.out.println(i);
                counter++;
            }
        }  
        int perc = (int)(((1.0*counter) / n)*100);
        System.out.println("There are " + counter + " primes between 2 and " + n + " (" + perc  +"% are primes)");
    }
}