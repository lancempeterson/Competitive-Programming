class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int targetColor = image[sr][sc];
        if (targetColor != newColor){
            fillColor(image, sr, sc, newColor, targetColor);
        }
        return image;
    }
    public void fillColor(int[][] image, int r, int c, int newColor, int targetColor){
        if (image[r][c] != targetColor){
            return;
        }
        image[r][c] = newColor;
        if (r < image.length -1){
            fillColor(image, r + 1, c, newColor, targetColor);
        }
        if (r > 0){
            fillColor(image, r - 1, c, newColor, targetColor);
        }
        if (c > 0){
            fillColor(image, r, c - 1, newColor, targetColor);
        }
        if (c < image[r].length - 1){
            fillColor(image, r, c + 1, newColor, targetColor);
        }
    }
}