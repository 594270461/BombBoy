public interface MovePathLimit {
    /**
     * ��X����ǰ���Ƿ�������
     * @param xInMap
     * @param yInMap
     * @param xArrow
     * @return
     */
    public boolean hasLimitX(int xInMap,int yInMap, int xArrow);

    /**
     * ��Y����ǰ���Ƿ�������
     * @param xInMap
     * @param yInMap
     * @param yArrow
     * @return
     */
    public boolean hasLimitY(int xInMap,int yInMap, int yArrow);

}
