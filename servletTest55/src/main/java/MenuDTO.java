public class MenuDTO {

    private String menuName;
    private int amount;

    public MenuDTO(){}

    public MenuDTO(String menuName, int amount) {
        this.menuName = menuName;
        this.amount = amount;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuName='" + menuName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
