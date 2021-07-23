class Codec {
    var dict: [String:String] = [:]
    var chars: String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    
    // Encodes a URL to a shortened URL.
    func encode(_ longUrl: String) -> String {
        var id = ""
        for _ in 0...4 {
            id.append(chars.randomElement()!)
        }
        dict[id] = longUrl
        return "http://tinyurl.com/\(id)"
    }
    
    // Decodes a shortened URL to its original URL.
    func decode(_ shortUrl: String) -> String {
        let id = String(shortUrl.suffix(5))
        return dict[id]!
    }
}

/**
 * Your Codec object will be instantiated and called as such:
 * let obj = Codec()
 * val s = obj.encode(longUrl)
 * let ans = obj.decode(s)
*/