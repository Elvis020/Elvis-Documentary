#include <iostream>





int main()
{
    struct S1 {
        char c;
        int i;
    } s1;                   /* initial values are indeterminate */
 
    static struct S2 {
        char c;
        int i;
    } s2;                   /* static storage duration: '',0    */
 
    struct S3 {
        char c;
        int  i;          
    } s3 = {'a',1};         /* declaration order */
 
    struct S4 {
        char c;
        int  i;          
    } s4 = {.i=1,.c='a'};   /* designators change initialization order */
 
    struct S5 {
        char c;
        int  i;          
    } s5 = {'a'};           /* too few initializers: 'a',0 */
 
    struct S6 {             /* sub-array */
        char c;
        int  i[5];          
    } s6 = { 'a',{1,2,3,4,5} };
 
    struct S7 {             /* sub-structure */
        struct s {
               char c;
               int i;
        } ss;
        char c;          
    } s7 = { {'a',1}, 'b' };
 
    return 0;
}