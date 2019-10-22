  window.onload = function() {
      let array = [1, 2, 3, 6, 9, 8, 7, 4];
      let clicks = 0;
      document.getElementById("btn5").onclick = function() {
          ff(++clicks)
      }
      const ff = (c) => {
        let a = new Array(1, 2, 3, 6, 9, 8, 7, 4);
        c = c >= a.length ? c%(a.length) : c;
        for(let i = 0; i < a.length; i++) {
            document.getElementById(`btn${array[i]}`).innerHTML = a[c > i ? i-c+a.length : i-c];
        }
        }
  }
