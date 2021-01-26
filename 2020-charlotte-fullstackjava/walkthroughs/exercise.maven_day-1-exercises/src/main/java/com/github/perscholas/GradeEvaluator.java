package com.github.perscholas;

/**
 * Created by leon on 7/14/2020.
 * If a score is between `100` and `90`, return `A`
 * If a score is between `89` and `80`, return `B`
 * If a score is between `79` and `70`, return `C`
 * If a score is between `69` and `65`, return `D`
 * If a score is less than `64`, return `F`.
 */
public class GradeEvaluator {
    public Boolean isGradeA(Double score) {
        if (score <= 100 && score >= 90) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isGradeB(Double score) {
        if (score <= 89 && score >= 80) {
            return true;
        }
        return false;
    }

    public Boolean isGradeC(Double score) {
        return score <= 79 && score >= 70;
    }

    public Boolean isGradeD(Double score) {
        return score <= 69 && score >= 65;
    }

    public Boolean isGradeF(Double score) {
        return score <= 64;
    }

    public Character getGrade(Double score) {
        if (isGradeA(score)) {
            return 'A';
        } else if (isGradeB(score)) {
            return 'B';
        } else if (isGradeC(score)) {
            return 'C';
        } else if (isGradeD(score)) {
            return 'D';
        } else if(isGradeF(score)){
            return 'F';
        } else {
            return null;
        }
    }
}
