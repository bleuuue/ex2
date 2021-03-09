package mapo

import java.util.*
import kotlin.collections.HashSet

fun lotto() : HashSet<Int> {
    val lottoSet: HashSet<Int> = HashSet()
    val rd = Random()

    while (true) {
        var lottoNum = rd.nextInt(45) + 1   // 1~46R까지 번호 랜덤 추출

        lottoSet.add(lottoNum)      // set에 추가

        if (lottoSet.size >= 7) {
            return lottoSet     // 번호 7개 선정 완료되면 return
        }
    }
}

fun main() {
    print("생성할 로또의 갯수를 입력하세요(1~5까지) : ")
    val upTo = Scanner(System.`in`).nextInt()   //입력

    var lottoList = Array(upTo, {IntArray(7)})  //입력 개수 x 로또 번호 7개 다차원 배열 선언

    for(i in 0..upTo-1)
    {
        lottoList[i] = lotto().sorted().toIntArray()   //lottoSet 정렬 후 Array 저장
    }
    //println(lottoList)      // 이렇게 안됨 다차원배열 출력시 아래처럼
    println(Arrays.deepToString(lottoList))
}
