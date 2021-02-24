public class ToolSet extends Item{
    private TypeOfWork work;
    private TypeOfTool toolSet;

    ToolSet(String toolName, TypeOfWork work) {
        super(toolName);
        this.work = work;
        this.toolSet = TypeOfTool.NOTHING;
    }

    public String getToolName() {
        return getName();
    }


    public String getToolInfo() {
        switch(this.toolSet) {
            case DECORATION_TOOL_SET:
                return getName() + " состоит из:\n\t•Молоток с гвоздями \n\t•Валик для покраски \n\t•Разные обои";
            case ROAD_TOOL_SET:
                return getName() + " состоит из:\n\t•Киянка \n\t•Плитка \n\t•Отбойный молоток";
            case ELECTRICITY_TOOL_SET:
                return getName() + " состоит из:\n\t•Киянка \n\t•Деревянные столбики \n\t•Прочные провода";
            case PLANTING_TOOL_SET:
                return getName() + " состоит из:\n\t•Семена \n\t•Тяпка \n\t•Лейка";
            case BUILDING_TOOL_SET:
                return getName() + " состоит из:\n\t•Киянка \n\t•Раствор для кладки \n\t•Стремянка";
            case ROCKET_TOOL_SET:
                return getName() + " состоит из:\n\t•Паяльник \n\t•Сложные микросхемы \n\t•Провода";
            case ROCKET_INSTALLING_SET:
                return getName() + " состоит из:\n\t•Связки ключей зажигания от строительного трансопорта";
            default:
                return "";
        }
    }
}
