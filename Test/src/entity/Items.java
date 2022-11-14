package entity;

import constant.ItemTypes;

import java.util.Scanner;

public class Items implements Inputable{

    private static int AUTO_ID = 999;
    private int id;
    private String name;
    private double price;

    private String group;

    private int amount;

    private ItemTypes type;

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String name) {
        this.group = group;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ItemTypes getType() {
        return type;
    }

    public void setType(ItemTypes type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", group=" + group +
                ", amount=" + amount +
                '}';
    }

    @Override
    public void inputInfo() {
        AUTO_ID++;
        this.id = AUTO_ID;
        System.out.print("Nhập tên hàng: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập loại hàng: ");
        System.out.println("1. Điện tử");
        System.out.println("2. Điện lạnh");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng");
        System.out.print("Lựa chọn: ");
        int typeTemp = 0;
        do {
            typeTemp = new Scanner(System.in).nextInt();
            if (typeTemp >= 1 && typeTemp <= 4) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (typeTemp) {
            case 1:
                this.type = ItemTypes.DIEN_TU;
                break;
            case 2:
                this.type = ItemTypes.DIEN_LANH;
                break;
            case 3:
                this.type = ItemTypes.MAY_TINH;
                break;
            case 4:
                this.type = ItemTypes.THIET_BI_VAN_PHONG;
                break;
        }
        System.out.print("Nhập giá hàng: ");
        this.price = new Scanner(System.in).nextDouble();
        System.out.print("Nhập số lượng hàng : ");
        this.amount = new Scanner(System.in).nextInt();
    }
}
