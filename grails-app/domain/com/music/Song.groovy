package com.music


import grails.rest.*

@Resource(uri = '/songs',readOnly = false, formats = ['json', 'xml'])
class Song {

	String title

}