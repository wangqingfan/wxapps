// map.js
Page({
  data: {
    latitude: 23.099994,
    longitude: 113.324520,
    markers: [{
      iconPath: "../../images/mapAddress.png",
      id: 0,
      latitude: 23.099994,
      longitude: 113.324520,
      width: 30,
      height: 30
    }]
  },
  regionchange(e) {
    console.log(e.type)
  },
  markertap(e) {
    console.log(e.markerId)
  },
  controltap(e) {
    console.log(e.controlId)
  }
})