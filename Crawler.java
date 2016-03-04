package crawler;
import java.util.*;
import java.io.*;


public class Crawler {

   
    public static void addTree(File file, Collection<File> all) {
        File[] childr = file.listFiles();
        if (childr != null) {
            for (File child : childr) {
                addTree(child, all);
            }
        }else{
            all.add(file);
        }
    }
    
   
    public static void searchIndex(HashMap Files) throws IOException{
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter the keyword you want to search Else Press 0 to exit");
            String st = in.nextLine();
            
            if(st.equals("0")){
                return;
            }
            
           
            Set set = Files.entrySet();
            Iterator i = set.iterator();
            
            while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                String val = (String)me.getValue();
                
                File file = new File(val);
                
                BufferedReader br = new BufferedReader(new FileReader(file));

                String line = null;
                while ((line = br.readLine()) != null) {
                        if(line.contains(st)){
                          System.out.println("The string exists in file: "+" "+val);
                        }
                }
     
            }   
        }
    }
    
 
    public static void printIndex(HashMap MyFiles){
        
            Set set = MyFiles.entrySet();
            Iterator st = set.iterator();
            System.out.println("The Index mapping is: ");
            while(st.hasNext()) {
                Map.Entry me = (Map.Entry)st.next();
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }
        
    }
    

    public static void main(String[] args) {
    
      
    Collection<File> all = new ArrayList<File>();

    addTree(new File("C:\\Users\\mabadin.bscs13seecs\\Documents\\NetBeansProjects\\crawler"), all);

    try {
        
       
        FileWriter fstream = null;
        fstream = new FileWriter("result.txt");
        BufferedWriter out = new BufferedWriter(fstream);

   
        HashMap<String,String> MyFiles = new HashMap();
               
        Iterator iter = all.iterator();
        while(iter.hasNext()){
           
            File tested = (File) iter.next();

            String myFile = tested.getName();
            String Fpath = tested.getPath();
            
   
        
            out.write(myFile+"         "+Fpath);
            out.newLine();
            
       
            MyFiles.put(myFile,Fpath);
                   
        }
            
    
        printIndex(MyFiles);
      
        searchIndex(MyFiles);
        
        out.close();
        }catch(IOException ex){}
                
    }
    
}

