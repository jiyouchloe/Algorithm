package algorithm;

import java.util.LinkedList;
import java.util.List;

/**
 * QuickSort
 *
 * <pre>
 * </pre>
 *
 * @date 2020. 1. 5.
 * @author jiyou.chloe
 *
 */
public class QuickSort {
    public List<Integer> getResult(List<Integer> paramList){
        return doSort(paramList);
    }

    /**
     * 재귀로 구현
     * @param paramList
     * @return
     */
    public List<Integer> doSort(List<Integer> paramList){

        if(paramList.size() <= 1){
            return paramList;
        }
        int pivotIdx = 0;
        List<Integer> leftList = new LinkedList<>();
        List<Integer> rightList = new LinkedList<>();

        for(int i = 1; i < paramList.size(); i++){
            if(paramList.get(i) < paramList.get(pivotIdx)){
                leftList.add(paramList.get(i));
            } else {
                rightList.add(paramList.get(i));
            }
        }
        if (leftList.size() > 1) {
            leftList = doSort(leftList);
        }
        if (rightList.size() > 1) {
            rightList = doSort(rightList);
        }
        List<Integer> resultList = new LinkedList<>();
        resultList.addAll(leftList);
        resultList.add(paramList.get(pivotIdx));
        resultList.addAll(rightList);

        return resultList;
    }

    public String toString (int[] paramArr){
        String resultStr = "";
        for(int i = 0; i < paramArr.length; i++){
            resultStr += paramArr[i];
            if(i < paramArr.length - 1){
                resultStr += ",";
            }
        }
        return resultStr;
    }
}
