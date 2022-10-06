public class Student {
    int rollNum;
    String name;
    String course;
    int m1,m2,m3;

    public int total(){
        return(m1+m2+m3);

    }
    public int average(){
        return (m1+m2+m3)/3;
    }
    public char grade(){
        if(average()>70){
            return 'A';
        }else{
            return 'B';
        }
    }
    public String toString(){
        return "Roll No:"+rollNum+"\n"+"Name: "+name+"\n"+"Course:"+course+"\n";
    }
}
