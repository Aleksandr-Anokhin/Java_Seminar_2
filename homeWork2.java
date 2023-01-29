/* 1) Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder.  */

public class homeWork2 {
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("select * from students where ");
        //System.out.println(sb.toString());

        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}".replace('{', ' ').replace(':', '=').replace('}', ' ');
            
        System.out.println(sb + str);
    }    
}

// Не понял, как сделать этот пункт: Если значение null, то параметр не должен попадать в запрос.
