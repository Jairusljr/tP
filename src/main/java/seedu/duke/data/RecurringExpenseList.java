package seedu.duke.data;

import java.util.ArrayList;

public class RecurringExpenseList {

    private final ArrayList<RecurringExpense> recurringExpenses = new ArrayList<>();

    public void add(RecurringExpense recurringExpense) {
        assert recurringExpense != null : "Recurring expense must not be null";
        recurringExpenses.add(recurringExpense);
    }

    public RecurringExpense delete(int indexInList) {
        int indexToDelete = indexInList - 1;
        return recurringExpenses.remove(indexToDelete);
    }

    public RecurringExpense get(int index) {
        return recurringExpenses.get(index);
    }
}
