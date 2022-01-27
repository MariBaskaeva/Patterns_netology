import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        StringBuilder builder;
        List<Integer> result = new ArrayList<>();
        int length = list.size();

        logger.log("Запускаем фильтрацию");
        while(!list.isEmpty()){
            int num = list.remove(0);
            if(num >= f){
                logger.log("Элемент " + num + " проходит");
                result.add(num);
            }
            else{
                logger.log("Элемент " + num + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элементов из " + length);
        return result;
    }
}