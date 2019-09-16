
# The Algorithm

The Euclidean Algorithm for finding GCD(A,B) is as follows:

* If A = 0 then GCD(A,B), since the GCD(0,B)=B and we can stop.

* If B = 0 then GCD(A,B), sinze the GCD(A,0)=A and we can stop.

* Write A in quotient remainder from (A = BxQ + R).

* Find GCD(B,R) using the euclidean algorithm since GCD(A,B) = GCD(B,R)

