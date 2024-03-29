package kr.devis.util.entityprinter.print.setting;

import kr.devis.util.entityprinter.constant.PrintOption;
import kr.devis.util.entityprinter.print.PrintConfigurator;

public class ExpandableEntitySetting extends AbstractExpandableSetting<Integer> {

    private final PrintConfigurator<Integer> printConfigurator = PrintConfigurator.<Integer>create();

    @Override
    public AbstractExpandableSetting<Integer> activateFields(Integer... fieldIndexes) {
        this.printConfigurator.activateFields(fieldIndexes);
        return this;
    }

    @Override
    public AbstractExpandableSetting<Integer> dateformat(String pattern) {
        this.printConfigurator.dateformat(pattern);
        return this;
    }

    @Override
    public AbstractExpandableSetting<Integer> allowMultiLine() {
        this.printConfigurator.allowMultiLine();
        return this;
    }

    @Override
    public AbstractExpandableSetting<Integer> withoutFloor() {
        this.printConfigurator.withoutFloor();
        return this;
    }

    @Override
    public AbstractExpandableSetting<Integer> excludeDataType() {
        this.printConfigurator.excludeDataType();
        return this;
    }

    @Override
    public AbstractExpandableSetting<Integer> expand(PrintOption... printOptions) {
        this.printConfigurator.applyAll(printOptions);
        return this;
    }

    @Override
    public AbstractExpandableSetting<Integer> noEscape() {
        this.printConfigurator.noEscape();
        return this;
    }

    @Override
    public AbstractExpandableSetting<Integer> noEllipsis() {
        this.printConfigurator.noEllipsis();
        return this;
    }

    @Override
    public PrintConfigurator<Integer> getConfig() {
        return this.printConfigurator;
    }
}
