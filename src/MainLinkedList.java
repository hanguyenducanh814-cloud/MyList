public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        System.out.println("--- 1. Kiểm tra phương thức add() và addFirst() ---");
        list.add("Node 2");
        list.add("Node 3");
        list.addFirst("Node 1");
        inDanhSach(list);

        System.out.println("\n--- 2. Kiểm tra phương thức add(int index, E element) ---");
        list.add(2, "Node Inserted");
        inDanhSach(list);

        System.out.println("\n--- 3. Kiểm tra phương thức get(int index) ---");
        System.out.println("Phần tử tại index 2 là: " + list.get(2));

        System.out.println("\n--- 4. Kiểm tra phương thức indexOf() và contains() ---");
        System.out.println("Vị trí của 'Node 3': " + list.indexOf("Node 3"));
        System.out.println("Có chứa 'Node 2' không?: " + list.contains("Node 2"));

        System.out.println("\n--- 5. Kiểm tra phương thức remove(int index) ---");
        String remoteValue = list.remove(2);
        System.out.println("Đã xóa phần tử: " + remoteValue);
        inDanhSach(list);

        System.out.println("\n--- 6. Kiểm tra phương thức clear() ---");
        list.clear();
        System.out.println("Kích thước sau khi xóa sạch: " + list.size());
    }

    public static void inDanhSach(LinkedList<String> list) {
        System.out.print("Danh sách hiện tại (size=" + list.size() + "): [");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
