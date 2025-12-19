class Solution {
    public ArrayList<Integer> rotate(int N, int D) {
        ArrayList<Integer> result = new ArrayList<>();
        D = D % 16;
        String binaryN = String.format("%16s", Integer.toBinaryString(N)).replace(' ', '0');
        String rotatedLeft = binaryN.substring(D) + binaryN.substring(0, D);
        String rotatedRight = binaryN.substring(16 - D) + binaryN.substring(0, 16 - D);
        int leftRotation = Integer.parseInt(rotatedLeft, 2);
        int rightRotation = Integer.parseInt(rotatedRight, 2);
        result.add(leftRotation);
        result.add(rightRotation);
class Solution {
    public ArrayList<Integer> rotate(int N, int D) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Ensure D is in the range [0, 15] to handle 16-bit binary representation.
        D = D % 16;

        // Convert N to its binary representation as a 16-bit string.
        String binaryN = String.format("%16s", Integer.toBinaryString(N)).replace(' ', '0');

        // Perform the left rotation by shifting bits to the left.
        String rotatedLeft = binaryN.substring(D) + binaryN.substring(0, D);

        // Perform the right rotation by shifting bits to the right.
        String rotatedRight = binaryN.substring(16 - D) + binaryN.substring(0, 16 - D);

        // Convert the binary strings back to decimal integers.
        int leftRotation = Integer.parseInt(rotatedLeft, 2);
        int rightRotation = Integer.parseInt(rotatedRight, 2);

        result.add(leftRotation);
        result.add(rightRotation);

        return result;
    }
}        return result;
    }
}