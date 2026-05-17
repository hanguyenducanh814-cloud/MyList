public class MainMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> studentList = new MyArrayList<>();

        System.out.println("--- 1. Kiểm tra phương thức add(E e) ---");
        studentList.add("An");
        studentList.add("Bình");
        studentList.add("Cường");
        inDanhSach(studentList);

        System.out.println("\n--- 2. Kiểm tra phương thức add(int index, E element) ---");
        studentList.add(1, "Dũng");
        inDanhSach(studentList);

        System.out.println("\n--- 3. Kiểm tra phương thức get(int index) ---");
        System.out.println("Phần tử ở vị trí index = 2 là: " + studentList.get(2));

        System.out.println("\n--- 4. Kiểm tra phương thức contains(E o) và indexOf(E o) ---");
        System.out.println("Có chứa 'Dũng' không? " + studentList.contains("Dũng"));
        System.out.println("Vị trí của 'Cường': " + studentList.indexOf("Cường"));

        System.out.println("\n--- 5. Kiểm tra phương thức remove(int index) ---");
        String daXoa = studentList.remove(2);
        System.out.println("Đã xóa phần tử: " + daXoa);
        inDanhSach(studentList);

        System.out.println("\n--- 6. Kiểm tra phương thức clear() và size() ---");
        System.out.println("Kích thước trước khi clear: " + studentList.size());
        studentList.clear();
        System.out.println("Kích thước sau khi clear: " + studentList.size());
    }

    public static void inDanhSach(MyArrayList<String> list) {
        System.out.print("Danh sách hiện tại (" + list.size() + " phần tử): [");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
