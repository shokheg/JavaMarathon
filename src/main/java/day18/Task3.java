package day18;



public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        addTo(root,23);
        addTo(root,14);
        addTo(root,27);
        addTo(root,22);
        addTo(root,16);
        addTo(root,11);
        addTo(root,150);
        addTo(root,24);
        addTo(root,18);
        addTo(root,15);
        addTo(root,5);
        addTo(root,8);

        dfs(root);

    }

    public static void addTo(Node root, long value) {    //Рекурсивная вставка.

        if (value < root.getValue()) {                    //Вставляемое значение меньше значения узла

            if (root.getLeft() == null){                  //Если нет левого поддерева, добавляем значение в левого ребенка,
               root.setLeft(new Node(value));
            } else {
                addTo(root.getLeft(), value);              //в противном случае повторяем для левого поддерева.
            }
        } else {                                            //Случай 2: Вставляемое значение больше или равно значению узла.
                                                            //Если нет правого поддерева, добавляем значение в правого ребенка,
            if (root.getRight() == null){
                root.setRight(new Node(value));
            } else {
                addTo(root.getRight(), value);              //в противном случае повторяем для правого поддерева.
            }
        }
    }




    public static void dfs(Node root) {
        if (root.getLeft() != null) {

            dfs(root.getLeft());

        }
        System.out.print(root.getValue()+ " ");

        if (root.getRight() != null) {
            dfs(root.getRight());
        }

    }






}