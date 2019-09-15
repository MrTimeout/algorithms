package main

import (
	"strconv"
	"strings"
	"testing"
)

//BenchmarkConversionItoa ...
func BenchmarkConversionItoa(b *testing.B) {
	var (
		i,
		v,
		j int
	)
	i = 0
	v = 1234
	for ; i < b.N; i++ {
		for j = 0; j < 10000; i++ {
			str := strconv.Itoa(v)
			strings.EqualFold(str, str)
		}
	}
}
