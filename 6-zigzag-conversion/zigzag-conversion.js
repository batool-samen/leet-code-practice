function convert(s, numRows) {
    if (numRows === 1 || s.length <= numRows) return s;

    const rows = Array(Math.min(numRows, s.length)).fill("").map(() => "");
    let currentRow = 0;
    let goingDown = false;

    for (let c of s) {
        rows[currentRow] += c;

        if (currentRow === 0 || currentRow === numRows - 1) {
            goingDown = !goingDown;
        }

        currentRow += goingDown ? 1 : -1;
    }

    return rows.join('');
}
