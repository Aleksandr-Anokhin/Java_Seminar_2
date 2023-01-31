/* 1) Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder.  */

public class homeWork2 {
    /**
     * @param args
     */
    public static void main(String args[]) {

        StringBuilder sb = new StringBuilder("select * from students where ");
        //System.out.println(sb.toString());

        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}".replace('{', ' ').replace(':', '=').replace('}', ' ');
        String[] substr =  str.split(", ");
        for (String string : substr) {
            String[] pairs = string.split("=");
            if (pairs[1].equals("'null' ") || pairs[1].equals("'null'")) {
                continue;
            }
            sb.append(pairs[0] + "=" + pairs[1] + " and ");
        }       
        System.out.println(sb);
    }    
}

