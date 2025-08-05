import React from 'react';

export default function Scorebelow70({ players }) {
  const playersBelow70 = players.filter((item) => item.score < 70);
  return (
    <div>
      {playersBelow70.map((item, index) => (
        <div key={index}>
          {item.name} {item.score}
        </div>
      ))}
    </div>
  );
}
