import { useEffect, useState } from "react";
import { getBoardList } from "../api/boardApi";

function BoardPage() {
  const [boards, setBoards] = useState([]);

  useEffect(() => {
    getBoardList()
      .then((data) => setBoards(data))
      .catch((err) => console.error(err));
  }, []);

  return (
    <div>
      <h1>Board List...</h1>

      <ul>
        {boards.map((board) => (
          <li key={board.boTable}>{board.boTable}</li>
        ))}
      </ul>
    </div>
  );
}

export default BoardPage;
