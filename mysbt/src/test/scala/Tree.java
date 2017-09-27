import java.io.File;

public class Tree {

    /**用树状结构打印出文件结构来   * @param args   */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        File f = new File("d:/test");
        System.out.println(f.getName()); //输出文件的名字
        tree(f,1);//1用来在根目录前打印空格
    }

    private static void tree(File f, int level) {
        String preStr = "";
        for(int i=0; i<level; i++) {
            preStr = preStr +"  ";
        }
        File[] chids = f.listFiles();
        for(int i=0; i<chids.length; i++) {
            System.out.println(preStr + chids[i].getName());
            if(chids[i].isDirectory()) {
                tree(chids[i], level+1);
            }
        }
    }
}
