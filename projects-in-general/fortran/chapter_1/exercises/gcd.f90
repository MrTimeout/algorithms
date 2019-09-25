
      program gcd
          integer :: a = 270 
          integer :: b = 192

          print *, "gcd(", a, ",", b, ") = ", a
      end program gcd
       
      function gcd_f(a, b)
        integer :: t
        do while(b > 0)
            t = mod(a, b)
            a = b
            b = t
        end do
        gcd_f = a
      end function gcd_f  
