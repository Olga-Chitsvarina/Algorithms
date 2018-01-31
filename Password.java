/**
 * Created  on 31.01.2018.
 */
public class Password {

    public Password (String passwordStr){
        int password = Integer.parseInt(passwordStr);
        printNumberOfPasswordsWithTheSameHash(password);
    }

    /* Takes four integers and returns
    h(a3a2a1a0) = ( (a3)**4 + (a2)**3 + (a1)**2 + a0 ) % 100 */
    public int applyFormula (int a3, int a2, int a1, int a0){
        return ((a3*a3*a3*a3) + (a2*a2*a2) + (a1* a1) + a0)% 100;
    }

    /* Takes the password of length 4 and
    calculate its hash value based on the hash function
    h(a3a2a1a0) = ( (a3)**4 + (a2)**3 + (a1)**2 + a0 ) % 100
     */
    public int calculateHash (int password) {

        // Define variables:
        int a3 = 0;
        int a2 = 0;
        int a1 = 0;
        int a0 = 0;
        char a3Str = '0';
        char a2Str = '0';
        char a1Str = '0';
        char a0Str = '0';

        // Find all  4 symbols in the password:
        String passwordStr = Integer.toString(password);
        if (password >= 1000) {
            a3Str = passwordStr.charAt(0);
            a2Str = passwordStr.charAt(1);
            a1Str = passwordStr.charAt(2);
            a0Str = passwordStr.charAt(3);
        } else if (password >= 100 && password < 1000) {
            a2Str = passwordStr.charAt(0);
            a1Str = passwordStr.charAt(1);
            a0Str = passwordStr.charAt(2);
        } else if (password >= 10 && password < 100) {
            a1Str = passwordStr.charAt(0);
            a0Str = passwordStr.charAt(1);
        } else {
            a0Str = passwordStr.charAt(0);
        }

        // Convert to int here:
        a3 = a3Str - '0';
        a2 = a2Str - '0';
        a1 = a1Str - '0';
        a0 = a0Str - '0';

        return applyFormula(a3, a2, a1, a0);
    }

    /* Take the password, find its hash value,
     * find the number of passwords of length 4 with the same hash value */
    public void printNumberOfPasswordsWithTheSameHash(int password){

        int i = 0;
        int hashOfOriginalPassword = calculateHash(password);
        int hashOfDifferentPassword = -1;
        int passwordsWithTheSameHash = 0;

        /* Calculate the number of passwords with the same hash value*/
        while (i< 10000){
            if (i !=  password) {
                hashOfDifferentPassword = calculateHash(i);
                if (hashOfDifferentPassword == hashOfOriginalPassword) {
                    passwordsWithTheSameHash++;
                }
            }
            i++;
        }

        System.out.println(passwordsWithTheSameHash);
    }
}
