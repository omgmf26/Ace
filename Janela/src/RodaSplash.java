
public class RodaSplash {
    public static void main(String[] args) {
            JFSplashScreen splash = new JFSplashScreen();
            splash.setVisible(true);
            
            JFLogin pr = new JFLogin();
          
            
            try{
                
                for (int i = 0; i <=100; i++) {
                    
                    Thread.sleep(40);
                    splash.lblPorcentagem.setText(Integer.toString(i)+"%");
                    splash.pgbPorcentagem.setValue(i);
                    if(i==100){
                        splash.dispose();
                        pr.setVisible(true);
                    }
                
                }
            } catch (Exception e) {
            }
            
                 
          
        
    }
    
}
