import React from 'react';

export default function ListofIndianPlayers({ IndianPlayers }) {
  return (
    <div>
      {IndianPlayers.map((player, index) => (
        <div key={index}>Mr. {player}</div>
      ))}
    </div>
  );
}
