package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val a = bill[k]
        var summa = 0
        var db = 0
        val fraze = "bon appetit"
        for (i in bill.indices) {
            summa += bill[i]
        }
        if ((summa - a) / 2 >= b) {
            return (fraze)
        } else {
            db = b - (summa - a) / 2
            return (Integer.toString(db))
        }
    }
}
