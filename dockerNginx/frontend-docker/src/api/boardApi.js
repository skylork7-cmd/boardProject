export async function getBoardList() {
    const response = await fetch("/api/board");
    if (response.ok) {
        const rtnJson = response.json();
        console.log("Board API response", rtnJson);
        return rtnJson;
    }
    throw new Error("API 호출 실패");
}
