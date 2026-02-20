export async function getBoardList() {
  const response = await fetch("/api/board");

  if (!response.ok) {
    throw new Error("API 호출 실패");
  }

  return response.json();
}
