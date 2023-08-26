package beyondbasics.annotations;

import java.util.ArrayList;
import java.util.List;

class BudgetPhone {
    public void megaDiscount() {
        System.out.println("5% offer applied");
    }

    @Deprecated
    public static void update() {
        System.out.println("Upgraded new features");
    }
}

class GamingPhone extends BudgetPhone {
    @Override
    public void megaDiscount() {
        System.out.println("25% offer applied");
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    // @SuppressWarnings("all")
    public void addPhones() {
        ArrayList list = new ArrayList();
        list.add("Lenova KS");

    }
}

class SafeVarargsTester {
    @SafeVarargs
    final void display(List<String>... products) {
        for (List<String> product : products) {
            System.out.println(product);
        }
    }
}

public class CommonAnnotations {
    // @SuppressWarnings({"unused","deprecation"})
    @SuppressWarnings("all")
    public static void main(String[] args) {
        GamingPhone phObj = new GamingPhone();
        BudgetPhone.update();

        phObj.addPhones();

        SafeVarargsTester obj = new SafeVarargsTester();
        List<String> list = new ArrayList<>();
        list.add("laptop");
        list.add("iPad");
        obj.display(list);
    }
}
