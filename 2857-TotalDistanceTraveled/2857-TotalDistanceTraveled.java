// Last updated: 8/12/2026, 8:45:21 AM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int litres=0;
        while(mainTank>0){
      mainTank--;
      litres++;
        if (litres % 5 == 0 && additionalTank > 0){
            additionalTank--;
            mainTank++;
    }
        }return litres*10;
}
}