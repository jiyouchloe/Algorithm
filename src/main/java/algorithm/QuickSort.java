package algorithm;

import java.util.*;
import java.util.Stack;

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

    /**
     * 재귀로 구현
     * @param paramList
     * @return
     */
    public List<Integer> doRecursiveSort(List<Integer> paramList){
        if(paramList.size() <= 1){
            return paramList;
        }
        int pivotIdx = 0;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        for(int i = 1; i < paramList.size(); i++){
            if(paramList.get(i) < paramList.get(pivotIdx)){
                leftList.add(paramList.get(i));
            } else {
                rightList.add(paramList.get(i));
            }
        }
        if (leftList.size() > 1) {
            leftList = doRecursiveSort(leftList);
        }
        if (rightList.size() > 1) {
            rightList = doRecursiveSort(rightList);
        }
        List<Integer> resultList = new LinkedList<>();
        resultList.addAll(leftList);
        resultList.add(paramList.get(pivotIdx));
        resultList.addAll(rightList);

        return resultList;
    }

    /**
     * while문으로 구현
     * @param paramList
     * @return
     */
    public List<Integer> doWhileSort(List<Integer> paramList){
        if(paramList == null || paramList.size() <= 1) {
            return paramList;
        }

        Stack<List<Integer>> jobToDoStack = new Stack<>();
        List<Integer> resultList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        jobToDoStack.push(paramList);
        int pivotVal = 0;

        while(!jobToDoStack.isEmpty()) {
            tempList = jobToDoStack.pop();

            if(tempList == null || tempList.size() < 1) {
                continue;
            }

            pivotVal = (int) tempList.get(0);

            if(tempList.size() == 1) {
                resultList.add(pivotVal);
            } else {
                HashMap<String,List<Integer>> leftPivotRightMap = doSortLeftPivotRight(tempList, pivotVal);

                if(leftPivotRightMap.get("rightList").size() > 0) {
                    jobToDoStack.push(leftPivotRightMap.get("rightList"));
                }

                jobToDoStack.push(leftPivotRightMap.get("pivot"));

                if(leftPivotRightMap.get("leftList").size() > 0) {
                    jobToDoStack.push(leftPivotRightMap.get("leftList"));
                }
            }
        }

        return resultList;
    }

    public HashMap<String,List<Integer>> doSortLeftPivotRight(List<Integer> paramList, int pivotVal){
        if(paramList.size() < 2) {
            return null;
        }
        HashMap<String,List<Integer>> leftRightMap = new HashMap<>();
        List<Integer> leftList = new LinkedList<>();
        List<Integer> rightList = new LinkedList<>();
        List<Integer> pivot = new LinkedList<>();
        pivot.add(pivotVal);

        int curVal = 0;
        for(int i = 1; i < paramList.size(); i++) {
            curVal = (int) paramList.get(i);
            if(curVal < pivotVal) {
                leftList.add(curVal);
            }else {
                rightList.add(curVal);
            }
        }
        leftRightMap.put("leftList", leftList);
        leftRightMap.put("rightList", rightList);
        leftRightMap.put("pivot", pivot);
        return leftRightMap;
    }
}
