import java.text.*;
import java.util.*;
class Remainder
{
        int d=0,p=0,i=0;
        public static final long XYZ = System.currentTimeMillis();
    Scanner sc=new Scanner(System.in);
    public void time()
    {
        for(;;)
        {
            int hour,sec,min;
            GregorianCalendar date=new GregorianCalendar();
            sec=date.get(Calendar.SECOND);
            min=date.get(Calendar.MINUTE);
            hour=date.get(Calendar.HOUR);
     if(hour==3&&min==03)
            {
                abcd();
                break;
            }
        }
    }
private void abcd()
        {
            System.out.println("HAI SIR.GOOD MORNING.ARE YOU FEELING GOOD OR BAD");
            String e=sc.nextLine();
            if (e.equalsIgnoreCase("good"))
                    i++;
                
            
            if (i>0)
            plan();
            else 
            {
                for(;;)
        {
            int hour,sec,min;
            GregorianCalendar date=new GregorianCalendar();
            sec=date.get(Calendar.SECOND);
            min=date.get(Calendar.MINUTE);
            hour=date.get(Calendar.HOUR);   
                if(hour==07&&min==29)
            {
                abcd();
                break;
            }
        }
        }
    
    }   public void plan()
            {
                int o=0;
                System.out.println("HOW MANY PLANS ARE YOU PLANNING TODAY SIR");
                int j=sc.nextInt();
                int []k=new int[j]; //hour
                int []l=new int[j]; //minute
                String []m=new String[j];//plan
                 String []gre=new String[j];
                int q=0;
                for(int n=0;n<j;n++)
                {
                    
                    System.out.println("ENTER YOUR PLAN SIR");
                    m[n]=sc.nextLine();
                    gre[n]=sc.nextLine();
                    System.out.println("ENTER THE TIME(HOUR) SIR");
                    k[n]=sc.nextInt();
                    System.out.println("ENTER THE TIME(MINUTE) SIR");
                    l[n]=sc.nextInt();
                }
               if(j==1)
               for(;;)
               {
                   int hour,sec,min;
                   GregorianCalendar date=new GregorianCalendar();
                   sec=date.get(Calendar.SECOND);
                   min=date.get(Calendar.MINUTE);
                   hour=date.get(Calendar.HOUR);
                   for(int i=0;i<j;i++)  
                   {if(hour==k[i]&&min==l[i]&&sec==00)
                       
                      
                      {
                         System.out.println("\fThis is a remainder "+gre[i]+"\nAs time is "+k[i]+":"+l[i]);
                        }
                    }
                }
                if(j==2)
               
                for(;;)
               {
                   
                   int hour,sec,min;
                   GregorianCalendar date=new GregorianCalendar();
                   sec=date.get(Calendar.SECOND);
                   min=date.get(Calendar.MINUTE);
                   hour=date.get(Calendar.HOUR);
                   
                   if(hour==k[0]&&min==l[0]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[0]+"\nAs time is "+k[0]+":"+l[0]);            
                         
            } 
                
            {if(hour==k[1]&&min==l[1]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[1]+"\nAs time is "+k[1]+":"+l[1]);            
                         
            }
        }  
    }
        if(j==3)
               
                for(;;)
               {
                   int hour,sec,min;
                   GregorianCalendar date=new GregorianCalendar();
                   sec=date.get(Calendar.SECOND);
                   min=date.get(Calendar.MINUTE);
                   hour=date.get(Calendar.HOUR);
                   if(hour==k[0]&&min==l[0]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[0]+"\nAs time is "+k[0]+":"+l[0]);            
                         
            } 
                   if(hour==k[1]&&min==l[1]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[1]+"\nAs time is "+k[1]+":"+l[1]);            
                         
            }
            if(hour==k[2]&&min==l[2]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[2]+"\nAs time is "+k[2]+":"+l[2]);            
                         
            }
        }  
        if(j==4)
               
                for(;;)
               {
                   int hour,sec,min;
                   GregorianCalendar date=new GregorianCalendar();
                   sec=date.get(Calendar.SECOND);
                   min=date.get(Calendar.MINUTE);
                   hour=date.get(Calendar.HOUR);
                   if(hour==k[0]&&min==l[0]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[0]+"\nAs time is "+k[0]+":"+l[0]);            
                         
            } 
                   if(hour==k[1]&&min==l[1]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[1]+"\nAs time is "+k[1]+":"+l[1]);            
                         
            }
            if(hour==k[2]&&min==l[2]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[2]+"\nAs time is "+k[2]+":"+l[2]);            
                                     }
            if(hour==k[3]&&min==l[3]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[3]+"\nAs time is "+k[3]+":"+l[3]);            
                         
            }
        }  
        if(j==5)
               
                for(;;)
               {
                   int hour,sec,min;
                   GregorianCalendar date=new GregorianCalendar();
                   sec=date.get(Calendar.SECOND);
                   min=date.get(Calendar.MINUTE);
                   hour=date.get(Calendar.HOUR);
                   if(hour==k[0]&&min==l[0]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[0]+"\nAs time is "+k[0]+":"+l[0]);            
                         
            } 
                   if(hour==k[1]&&min==l[1]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[1]+"\nAs time is "+k[1]+":"+l[1]);            
                         
            }
            if(hour==k[2]&&min==l[2]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[2]+"\nAs time is "+k[2]+":"+l[2]);            
                         
            }
            if(hour==k[3]&&min==l[3]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[3]+"\nAs time is "+k[3]+":"+l[3]);            
                         
            }
            if(hour==k[4]&&min==l[4]&&sec==00)
                      {
                         System.out.println("\fThis is a remainder "+gre[4]+"\nAs time is "+k[4]+":"+l[4]);            
                         
            }
        }
    }
}
