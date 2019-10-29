
public class ImplementsRunnable {

    private static final DuckFactory df = new DuckFactory();
    private static final PigFactory pf = new PigFactory();

    public static void main(String... args) {
        java.lang.Thread duck1 = new java.lang.Thread(df);
        java.lang.Thread pig1  = new java.lang.Thread(pf);
        java.lang.Thread anonymous = new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for(int j = 0; j < 10; j++) {
                        System.out.printf("Anonyomus %d\n", j);
                        java.lang.Thread.sleep(Rubbish.randomNumber(1000, 5000));
                    }
                } catch(java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }   
        });

        duck1.start();
        pig1.start();
        anonymous.start();

    }

}

class DuckFactory implements java.lang.Runnable {
    
    @Override 
    public void run() {
        try {
            for(int j = 0; j < 10; j++) {
                System.out.printf("I am a Duck %d\n", j);
                java.lang.Thread.sleep(Rubbish.randomNumber(1000, 5000));
            }
        } catch(java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class PigFactory extends java.lang.Thread {
    
    @Override
    public void run() {
        try {
            for(int j = 0; j < 10; j++) {
                System.out.printf("I am a Pig %d\n", j);
                java.lang.Thread.sleep(Rubbish.randomNumber(1000, 5000));
            }
        } catch(java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }

}

class Rubbish {
    
    public static int randomNumber(int min, int max) {
        return new java.util.Random().nextInt(max-min + 1) + min;
    }

}
