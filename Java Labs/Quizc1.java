public class Quizc1 {
  public static void main(String[]args){
    //char [] word = {'r','a' , 'c', 'e', 'c', 'a', 'r'};
    //char [] word = {'a' , 'm', 'm',  'a', 'd'};
    char [] word = {'m','a','d','m','a','n'};
    int half = word.length/2;
    int first=0;
    int last=word.length-1;
    int flag=0;
   for(int i=0;i<half;i++){
      if(word[first]!= word[last]){
        flag++;
      }
      first++;
      last--;
      
      if( flag==0){
        System.out.println("palindrome after 0 rotations");
      }
    
    else{
     char []copy= new char[word.length];
       for( int j=0;j<copy.length;j++){
          copy[j]=word[i];
        }
        for(int j=0;j<word.length;j++){
          int k=j;
          for(int p=0;p<copy.length;p++){
            word[p]= copy[k%copy.length];
            k++;
          
        
      
      
      if( flag==0){
        System.out.println("palindrome after" +j+"left rotations");
       
      }
      if (flag !=0){
        System.out.println("palindrome after" +j+"left rotations");
      }
      else{
         System.out.println("cannot be palindrome");
      }
    }
        }
    }
    }
  }
}
  
