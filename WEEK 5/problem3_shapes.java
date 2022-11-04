class problem3_shapes {

    public static void main(String[] args) {
        rectangleShape();
        System.out.println("\n");
        triangleShape();

    } 
    public static void rectangleShape(){
        for (Integer i = 0; i < 4; i++) {

            if (i >= 1 && i <= 2) {
                for (Integer j = 0; j < 5; j++) {
                    if (j >= 1 && j <= 3) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            } else {
                for (Integer j = 0; j < 5; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
    public static void triangleShape(){
        int tri = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < tri; j++) {
                if (tri == 3 || tri == 4) {
                    if (j == 0 || j == (tri - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            tri++;
            System.out.println("");
            }    
        }
    }    

