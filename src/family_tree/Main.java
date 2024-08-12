package family_tree;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree tree = testTree();
        System.out.println(tree);
    }

    static FamilyTree testTree() {
        FamilyTree tree = new FamilyTree();

        Human igor = new Human("Игорь", Gender.MALE, LocalDate.of(1975, 6, 02), null, null, null);
        Human alexa = new Human("Александра", Gender.FEMALE, LocalDate.of(1980, 7, 03), null, null, null);
        tree.add(igor);
        tree.add(alexa);
        Human masha = new Human("Мария", Gender.FEMALE, LocalDate.of(1999, 8, 5), null, alexa, igor);
        Human ivan = new Human("Иван", Gender.MALE, LocalDate.of(2002, 3, 16), null, alexa, igor);
        tree.add(masha);
        tree.add(igor);
        Human grandMother = new Human("Любовь", Gender.FEMALE, LocalDate.of(1956, 6, 02), null, null, null);
        grandMother.addChild(alexa);
        tree.add(grandMother);
        return tree;
    }
}