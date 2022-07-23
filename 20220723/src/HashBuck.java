/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuk
 * Date: 2022-07-23
 * Time: 9:10
 */
public class HashBuck {
    static class Node{
        public int key;
        public int val;
        public Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    public Node[] array;
    public int usedSize;//记录当前哈希桶有效数据的个数
    public HashBuck() {
        this.array = new Node[10];
        this.usedSize = 0;
    }

    /**
     * 存储key，val
     * @param key
     * @param val
     * @return
     */
    public void put(int key, int val) {
        Node node =new Node(key,val);
        int index = key %array.length;
        Node cur = array[index];
        while (cur!= null) {
            if (cur.key == key) {
                cur.val = val;
                return ;
            }
            cur = cur.next;
        }//头插
        node.next = array[index];
        array[index] = node;
        usedSize++;
        //if(loadFactor() > DEFAULT)
    }
    private float loadFactor() {
        return usedSize*1.0f / array.length;
    }



    private void grow() {

        Node[] newArray = new Node[2* array.length];
        //重新的哈希
        /**
         * 1. 遍历数组的每个元素的链表
         * 2. 每遍历到一个节点，就重新哈希  key % len
         * 3. 进行头插法
         */
        for (int i = 0; i < array.length; i++) {
            Node cur = array[i];
            while (cur != null) {
                Node curNext = cur.next;
                int index = cur.key % newArray.length;
                cur.next = newArray[index];
                newArray[index] =cur;
                cur = curNext;
            }
        }
        this.array = newArray;
    }
}
